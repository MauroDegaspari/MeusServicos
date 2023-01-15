
     --<SEQUENCE>
   -- DESCRIÇÃO ...: 'seq_cliente' - - "Nome da Tela"
   -- RESPONSAVEL..: Mauro Degaspari
   -- DATA.........: 01/15/2023
   -- APLICA??O....:  MeusServiços
   -- </ds_script>

   -- <USUARIO = DBAMS>
   -- DROP SEQUENCE dbams.seq_cliente

   CREATE SEQUENCE seq_cliente
   minvalue 1
   maxvalue 9999999999
   start with 3
   increment by 1
   nocache
   cycle;