  --<Ds_script>
-- DESCRI??O ...: 'Clientes' - Cria��o da tabela de cadastro de Clientes - "Nome da Tela"
-- RESPONSAVEL..: Mauro Degaspari
-- DATA.........: 09/01/2023
-- APLICA??O....:  MeusServi�os
-- </ds_script>

-- <USUARIO = DBAMS>

CREATE TABLE dbams.clientes(

   cd_cliente   NUMBER         NOT NULL,
   nm_cliente   VARCHAR2(123)  NOT NULL,
   cpf          NUMBER         NOT NULL,
   dt_cadastro  DATE           NULL
 )



