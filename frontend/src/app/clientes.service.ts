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
    cliente.nome = 'Testte Service';
    cliente.cpf = '1237890'

    return cliente;
  }
}
