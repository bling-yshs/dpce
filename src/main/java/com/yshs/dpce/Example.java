package com.yshs.dpce;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Example.MOD_ID, clientSideOnly = true,acceptableRemoteVersions = "*")
public class Example {
    public static final String MOD_ID = "dpce";

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {
        System.out.println("dpce init");
    }
}
