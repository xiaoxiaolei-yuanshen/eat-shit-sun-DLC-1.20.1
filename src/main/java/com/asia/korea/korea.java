package com.asia.korea;

import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.lwjgl.glfw.GLFW;

@Mod("korea")
public class korea {
    public static final String MODID = "korea";

    // 开关状态 - 默认开启
    public static boolean effectEnabled = true;
    // 中立生物跟随开关状态 - 默认开启
    public static boolean followEnabled = true;
    // 南韩效果开关状态 - 默认开启
    public static boolean southKoreaEnabled = true;
    // 当前播放的音乐ID（0=未播放, 1=niruosandong, 2=niruosandongDJ, 3=niruosandongDJsu）
    public static int currentPlayingMusic = 0;

    public korea() {
        // 注册客户端设置事件
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        // 注册按键映射事件
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::registerKeyBindings);

        // 注册事件处理器
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        // 客户端初始化代码
    }

    private void registerKeyBindings(final RegisterKeyMappingsEvent event) {
        event.register(KeyBindings.TOGGLE_EFFECT_KEY);
        event.register(KeyBindings.TOGGLE_FOLLOW_KEY);
        event.register(KeyBindings.TOGGLE_SOUTH_KOREA_KEY);
    }
}