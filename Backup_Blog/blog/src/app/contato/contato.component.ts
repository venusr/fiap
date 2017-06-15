import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl} from '@angular/forms';

@Component({
  selector: 'app-contato',
  templateUrl: './contato.component.html',
  styleUrls: ['./contato.component.css']
})
export class ContatoComponent implements OnInit {
  contatoForm: FormGroup;
  constructor(private fb:FormBuilder) { }

mensagensErro = { 'nome': {'required':'favor preencher o nome'}
,'email': { 'required':'favor preencher o email',
  'emailIsValid':'o formato do email preenchido esta incorreto'}
, 'texto': { 'required':'favor preencher o texto',
  'minlength': 'voce precisa informar um texto com no minimo 5 caracteres',
  'maxlength': 'o limite de texto é de 100 caracteres'}  };

ngOnInit() {this.buildForm();  }

buildForm() {
  this.contatoForm = this.fb.group({
    'nome':['', [Validators.required]],
    'email':['', [Validators.required]],
    'texto':['',[Validators.required,
    Validators.minLength(4), Validators.maxLength(100)]]
  });
}

}


