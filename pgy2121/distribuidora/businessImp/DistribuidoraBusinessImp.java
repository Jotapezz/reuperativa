/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121.distribuidora.businessImp;

import cl.duoc.pgy2121.distribuidora.business.DistribuidoraBusiness;

/**
 *
 * @author JP
 */
public class DistribuidoraBusinessImp implements DistribuidoraBusiness {

    @Override
    public int ObtenerIva(int precio) {
        return precio * (19/100);
    }

    @Override
    public int DctoVino(int precio) {
        
        return 0;
    }

    @Override
    public int DctoBebida(int dctoBebida) {
        
        return 0;
    }
    
    
}
