/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamefactory.displayable.gameobjects;

import com.gamefactory.components.Collider;
import com.gamefactory.components.Position;
import com.gamefactory.components.Renderer;
import com.gamefactory.displayable.GameObject;
import com.gamefactory.displayable.Scene;
import com.gamefactory.scripts.AnimatorFourDirections;
import com.gamefactory.scripts.BlockOnCollisionListener;
import com.gamefactory.scripts.GameObjectCameraScript;
import com.gamefactory.scripts.PlayerInputHandlerProjectile;

/**
 *
 * @author ngo
 */
public class Projectile extends GameObject {
    
    @Override
    public void init(Scene owner) {
        super.init(owner);
        this.componentManager.add(new Position(), new Renderer(), new Collider());
        this.getScriptManager().add(new AnimatorFourDirections(), new PlayerInputHandlerProjectile(), new GameObjectCameraScript(),new BlockOnCollisionListener());
    }
    
}