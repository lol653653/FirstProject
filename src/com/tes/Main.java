/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tes;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        Pamuk hammadde = new Pamuk();

        IplikMakinesi makine = new IplikMakinesi();

        Iplik Urun = makine.pamuguIplikYap(hammadde);
    }

}
