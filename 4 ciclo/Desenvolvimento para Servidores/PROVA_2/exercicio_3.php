<?php

	abstract class Usuario{
		protected $apelido,$ip,$status;
		public function __construct($apelido, $ip,$status="Comum"){
			$this->apelido = $apelido;
			$this->ip = $ip;
			$this->status = $status;
		}
		public function getStatus(){
			return $this->status;
		}
		abstract public function listar();
	}

	class Comum extends Usuario {
		public function __construct($apelido,$ip){
			parent :: __construct($apelido,$ip);
		}
		public function listar(){
			echo "Apelido: $this->apelido<br>";
			echo "Ip: $this->ip<br>";
			echo "Status: $this->status<br><br>";
		}
	}
	class Banido extends Usuario {
		public function __construct($apelido,$ip){
			parent :: __construct($apelido,$ip,"Banido");
		}
		public function listar(){
			echo "Apelido: $this->apelido<br>";
			echo "Ip: $this->ip<br>";
			echo "Status: $this->status<br>";
		}
	}

	interface administrador{
		public function enviar(Usuario $de,$msg);
	}
	class Batepapo implements administrador{
		public function enviar(Usuario $de,$msg){
			if($de->getStatus() != "Banido" )
				echo $msg;
		}
	}
	class AdminCentral implements administrador{
		public function enviar(Usuario $de,$msg){
			if($de->getStatus() != "Banido" ){
				echo $msg;
			}else{
				$de->listar();
				echo $msg;
			}
		}
	}
	echo "Instancia de Objetos<br>";
	$c = new Comum("vitor_gja_","192.168.0.1");
	$c->listar();
	$b = new Banido("maristela","192.168.0.2");
	$b->listar();

	echo "<br>Mensagem para a central<br>";
	$adm = new AdminCentral();
	$adm->enviar($c,"Isso e uma MSG para a central<br>");
	$adm->enviar($b,"Isso e outra msg para a central<br>");

	echo "<br>Mensagem para o BatePapo<br>";
	$bp = new BatePapo();
	$bp->enviar($c,"Comum Isso e uma mensagem para o BatePapo<br>");
	$bp->enviar($b,"Banido Isso e outra mensagem para o BatePapo<br>");

?>