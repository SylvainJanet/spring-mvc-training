package springmvcapp.o5files;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/files")
public class FileController {

	@GetMapping("/download")
	public String download(HttpServletResponse response) throws IOException {
		response.setContentType("text");
		response.setHeader("Content-Disposition", "attachment;filename=monfichier.txt");
		ServletOutputStream out = response.getOutputStream();
		out.write("Ceci est un test ! ".getBytes());
		out.close();
		return "firstPage";
	}

	@GetMapping("/upload")
	public String upload() {
		return "uploadPage";
	}

	@PostMapping("/upload")
	public String uploadPost(@RequestParam("fileToUpload") MultipartFile multipartFile, Model model)
			throws IOException {
		File file = new File("C:/FormationSpring/20220307/");
		if (!file.exists()) {
			file.mkdirs();
		}
		File fileUp = new File(file, multipartFile.getOriginalFilename());
		BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(fileUp));
		writer.write(multipartFile.getBytes());
		writer.flush();
		writer.close();
		model.addAttribute("message", "File uploaded !");
		return "firstPage";
	}
}
