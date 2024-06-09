package Equipamentos.EquipamentoMult;

import Equipamentos.Copiadora.Copiadora;
import Equipamentos.Digitalizadora.Digitalizadora;
import Equipamentos.Impressora.Impressora;

public class EquipamentoMult implements Copiadora, Digitalizadora, Impressora {
    
    public void copiar() {
        System.out.println("Copiando via equipamento mult");
    }

    public void digitalizar() {
        System.out.println("Digitalizando via equipamento mult");
    }

    public void imprimir () {
        System.out.println("Imprimindo via equipamento mult");
    }
}
