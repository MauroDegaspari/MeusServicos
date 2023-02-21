import { Injectable } from '@angular/core';
import { ClienteModel} from './clientes/clientesModel'

@Injectable({
  providedIn: 'root'
})
export class ClientesService {

  constructor() { }

  getCliente(): ClienteModel{
    let cliente: ClienteModel = new ClienteModel();
    cliente.nome = 'Testte Service';
    cliente.cpf = '1237890'

    return cliente;
  }
}
