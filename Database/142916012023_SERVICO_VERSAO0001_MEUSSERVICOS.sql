  --<TABELA>
-- DESCRI??O ...: 'Servico' - Cria��o da tabela de cadastro de servi�os para clientes - "Nome da Tela"
-- RESPONSAVEL..: Mauro Degaspari
-- DATA.........: 01/15/2023
-- APLICA??O....:  MeusServi�os
-- </ds_script>

-- <USUARIO = DBAMS>
-- DROP TABLE dbams.servico


  CREATE TABLE dbams.servico(

  cd_servico    NUMBER        NOT NULL,
  cd_cliente    NUMBER        NOT NULL,
  vl_servico    NUMBER            NULL,
  ds_descricao  VARCHAR(150)      NULL

  )

   TABLESPACE tbs_meusservicos

  /

  ALTER TABLE dbams.servico
  ADD CONSTRAINT cnt_cd_servico_pk PRIMARY KEY(cd_servico)

  USING INDEX
  TABLESPACE tbs_compravenda
  compute STATISTICS
  /

  ALTER TABLE dbams.servico
  ADD CONSTRAINT cnt_cd_cliente_fk FOREIGN KEY (cd_cliente)
  REFERENCES dbams.cliente (cd_cliente)

  /


  COMMENT ON TABLE dbams.servico IS 'Tabela onde os servi�os dos clientes foram realizados'
  /
  COMMENT ON COLUMN dbams.servico.cd_servico IS 'c�digo de servi�o feito por sequence'
  /
  COMMENT ON COLUMN dbams.servico.cd_cliente IS 'Chave estranjeira de cliente'
  /
  COMMENT ON COLUMN dbams.servico.vl_servico IS 'pre�o cobrado pelo servi�o realizado'
  /
  COMMENT ON COLUMN dbams.servico.ds_descricao IS 'Descri��o do servi�o feito no cliente'


