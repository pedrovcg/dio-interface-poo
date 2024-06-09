package Estabelecimento;

import Equipamentos.Copiadora.Copiadora;
import Equipamentos.Digitalizadora.Digitalizadora;
import Equipamentos.EquipamentoMult.EquipamentoMult;
import Equipamentos.Impressora.Impressora;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMult em = new EquipamentoMult();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizar();

    }
}
