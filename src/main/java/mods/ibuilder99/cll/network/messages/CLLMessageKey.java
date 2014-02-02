package mods.ibuilder99.cll.network.messages;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import mods.ibuilder99.cll.network.CLLMessageType;

/**
 * Combustible Lemon Launcher
 * Copyright (c) 2014 Phil Julian
 * @author Phil Julian (aka iBuilder99)
 */

public class CLLMessageKey extends MessageCLL {
	
	
	public CLLMessageKey(){
		super(CLLMessageType.MESSAGE_KEY);
	}

	@Override
	public void fromBytes(ByteBuf buf){
		
	}
	
	@Override
	public void writeData(ByteBuf buf){
		
	}

	@Override
	public void executeMessage(EntityPlayerMP player){
		
	}

}