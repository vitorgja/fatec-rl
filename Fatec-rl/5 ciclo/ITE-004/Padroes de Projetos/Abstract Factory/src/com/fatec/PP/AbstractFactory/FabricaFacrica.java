package com.fatec.PP.AbstractFactory;

public enum FabricaFacrica {
	SEDAN {
		@Override
		public Carro fabricarCarro() {
			// TODO Auto-generated method stub
			FabricaSedan fs = new FabricaSedan();
			// O NOME DO CARRO E SUA LOCALIDADE
			// SAO ORIUNDOS DE UM BANCO DE DADOS
			return fs.criarCarro("Carro Sefan", Localidade.ASIA);
		}
	}, LUXO {
		@Override
		public Carro fabricarCarro() {
			// TODO Auto-generated method stub
			FabricaLuxo fl = new FabricaLuxo();
			// O NOME DO CARRO E SUA LOCALIDADE
			// SAO ORIUNDOS DE UM BANCO DE DADOS
			return fl.criarCarro("Carro LUXO", Localidade.EUROPA);
		}
	}, POPULAR {
		@Override
		public Carro fabricarCarro() {
			// TODO Auto-generated method stub
			FabricaSedan fs = new FabricaSedan();
			// O NOME DO CARRO E SUA LOCALIDADE
			// SAO ORIUNDOS DE UM BANCO DE DADOS
			return fs.criarCarro("Carro ", Localidade.ASIA);
		}
	};
	
	abstract public Carro fabricarCarro();
}
