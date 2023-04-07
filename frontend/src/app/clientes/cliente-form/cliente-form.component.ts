import { Component, OnInit } from '@angular/core';
import { ClienteModel } from '../clientesModel';
import {ClientesService} from '../../clientes.service'
@Component({
  selector: 'app-cliente-form',
  templateUrl: './cliente-form.component.html',
  styleUrls: ['./cliente-form.component.css']
})
export class ClienteFormComponent implements OnInit{

  clientes: ClienteModel = new ClienteModel;
  
  constructor( private clienteService: ClientesService){
    this.clientes = new ClienteModel();
  
  }

  ngOnInit(): void {
    
  }

  onSubmit(){
     this.clienteService
         .salvar(this.clientes)
         .subscribe( response =>{
          console.log(response);
         })
  }
}
