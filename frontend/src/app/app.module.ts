import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import {ClientesComponent} from './clientes/clientes.component';

import {TemplateModule} from './template/template.module'


@NgModule({
  declarations: [
    AppComponent,
    ClientesComponent
    
  ],
  imports: [
    BrowserModule,
    TemplateModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
