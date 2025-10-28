package com.asia.korea;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBindings {
    public static final KeyMapping TOGGLE_EFFECT_KEY = new KeyMapping(
            "key.korea.toggle_effect", // 本地化键名
            KeyConflictContext.IN_GAME, // 冲突上下文
            InputConstants.Type.KEYSYM, // 按键类型
            GLFW.GLFW_KEY_V, // V键
            "key.categories.korea" // 按键类别
    );

    public static final KeyMapping TOGGLE_FOLLOW_KEY = new KeyMapping(
            "key.korea.toggle_follow", // 本地化键名
            KeyConflictContext.IN_GAME, // 冲突上下文
            InputConstants.Type.KEYSYM, // 按键类型
            GLFW.GLFW_KEY_B, // B键
            "key.categories.korea" // 按键类别
    );

    public static final KeyMapping TOGGLE_SOUTH_KOREA_KEY = new KeyMapping(
            "key.korea.toggle_south_korea", // 本地化键名
            KeyConflictContext.IN_GAME, // 冲突上下文
            InputConstants.Type.KEYSYM, // 按键类型
            GLFW.GLFW_KEY_C, // C键
            "key.categories.korea" // 按键类别
    );
}