package fiap.scj.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fiap.scj.springmvc.bean.Aluno;

@Controller
public class AlunoController {

	@RequestMapping(value = "/aluno", method = RequestMethod.GET)
	public String exibirFormulario() {
		return "cadastro";
	}

	@RequestMapping(value = "/aluno", method = RequestMethod.POST)
	public String cadastrar(Aluno aluno, Model model) {
		System.out.println(aluno); // Chamada ao model
		model.addAttribute("mensagem", "Aluno " + aluno.getNome() + " cadastrado com sucesso");
		return "index";
	}

}
