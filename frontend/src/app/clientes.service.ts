import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { ClienteModel} from './clientes/clientesModel'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClientesService {

  constructor(private http: HttpClient) { 
    
  }

  salvar(cliente:ClienteModel) : Observable <ClienteModel>{
    return this.http.post<ClienteModel>('http://localhost:8091/api/cliente' ,cliente);

  }

  getCliente(): ClienteModel{
    let cliente: ClienteModel = new ClienteModel();
    cliente.nome = 'Teste Service';
    cliente.cpf = '1123123';
  

    return cliente;
  }
}
