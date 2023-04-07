import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { ClienteModel} from './clientes/clientesModel'

@Injectable({
  providedIn: 'root'
})
export class ClientesService {

  constructor(private http: HttpClient) { 
    
  }

  getCliente(): ClienteModel{
    let cliente: ClienteModel = new ClienteModel();
    cliente.nome = 'Teste Service';
    cliente.cpf = '1123123';
    cliente.id = 23;
    cliente.dataCadastro = '2/2/9000';

    return cliente;
  }
}
