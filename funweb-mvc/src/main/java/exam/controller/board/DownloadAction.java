package exam.controller.board;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exam.controller.Action;
import exam.dao.AttachfileDao;
import exam.domain.AttachfileVo;
import lombok.extern.java.Log;

@Log
public class DownloadAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		// uuid 파라미터 가져오기
		String uuid = request.getParameter("uuid");
		
		// DB객체 가져오기
		AttachfileDao dao = AttachfileDao.getInstance();
		// uuid에 해당하는 레코드 한개 가져오기
		AttachfileVo vo = dao.getAttachfileByUuid(uuid);
		
		// 다운로드할 파일 객체 준비
		String filename = vo.getUuid() + "_" + vo.getFilename();
		File file = new File(vo.getUploadpath(), filename);
		
		// 입력스트림 준비
		BufferedInputStream is = null;
		is = new BufferedInputStream(new FileInputStream(file));
		
		// 마임타입 가져오기 (이미지 images/png 등등)
		ServletContext application = request.getServletContext();
		String mimeType = application.getMimeType(file.getPath());
		if (mimeType == null) {
			mimeType = "application/octet-stream";
		}
		
		response.setContentType(mimeType);
		
		System.out.println("utf-8 filename = " + filename);
		
		// 다운로드 파일명의 문자셋을 utf-8에서 iso-8859-1로 변환
		filename = new String(filename.getBytes("utf-8"), "iso-8859-1");
		System.out.println("iso-8859-1 filename = " + filename);
		
		// 다운로드할 파일이름에서 UUID 제거하기
		int beginIndex = filename.indexOf("_") + 1;
		String downloadFilename = filename.substring(beginIndex);
		
		// 헤더에 다운로드할 파일이름을 설정
		response.setHeader("Content-Disposition", "attachment; filename=" + downloadFilename);
		
		// 출력스트림 준비
		ServletOutputStream os = response.getOutputStream();
		
		int data;
		while ((data = is.read()) != -1) {
			os.write(data);
		}
		
		// 입출력 객체 자원닫기
		os.close(); // close() 내에서 flush() 호출됨
		is.close();
		
		
		return null;
	}

}



