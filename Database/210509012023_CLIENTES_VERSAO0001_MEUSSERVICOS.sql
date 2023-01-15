  --<TABELA>
-- DESCRI??O ...: 'Clientes' - Criação da tabela de cadastro de Clientes - "Nome da Tela"
-- RESPONSAVEL..: Mauro Degaspari
-- DATA.........: 09/01/2023
-- APLICA??O....:  MeusServiços
-- </ds_script>

-- <USUARIO = DBAMS>
-- DROP TABLE dbams.cliente

CREATE TABLE dbams.cliente(

   cd_cliente   NUMBER         NOT NULL,
   nm_cliente   VARCHAR2(123)  NOT NULL,
   cpf          NUMBER         NOT NULL,
   dt_cadastro  DATE           NULL   --DEFAULT SYSDATE
 )

  TABLESPACE tbs_meusservicos

  /

ALTER TABLE dbams.cliente
ADD CONSTRAINT cnt_cd_cliente_pk PRIMARY KEY(cd_cliente)

 USING INDEX
  TABLESPACE tbs_compravenda
  compute STATISTICS
/


COMMENT ON TABLE dbams.cliente IS 'Tabela onde estão amarzanado os clientes'
/
COMMENT ON COLUMN dbams.cliente.cd_cliente IS 'código de cliente'
/
COMMENT ON COLUMN dbams.cliente.nm_cliente IS 'nome do cliente'
/
COMMENT ON COLUMN dbams.cliente.cpf IS ''
/
COMMENT ON COLUMN dbams.cliente.dt_cadastro IS 'data a qual o cliente foi cadastrado'





