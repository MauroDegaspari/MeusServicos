import { Component, OnInit } from '@angular/core';
import { ClienteModel } from '../clientesModel';

@Component({
  selector: 'app-cliente-form',
  templateUrl: './cliente-form.component.html',
  styleUrls: ['./cliente-form.component.css']
})
export class ClienteFormComponent implements OnInit{

  clientes: ClienteModel = new ClienteModel;
  
  constructor(){
    
  
  }

  ngOnInit(): void {
    
  }

  onSubmit(){
     console.log(this.clientes);
  }
}
