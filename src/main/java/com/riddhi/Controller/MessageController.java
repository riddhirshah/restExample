package com.riddhi.Controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.riddhi.Entities.Messages;

@Path("/messages")
public class MessageController {
	
	MessageService messageService=new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Messages> getAllMessages()
	{
		System.out.println("Hello");
		return messageService.getAllMessages();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Messages addMessages(Messages message)
	{
		return messageService.saveMessage(message);	
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Messages getMessagebyID(@PathParam("id") int id )
	{
		return messageService.getMessage(id);	
	}
	
	@PUT
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Messages updateMessages(@PathParam("id") int id,Messages message)
	{
		message.setId(id);
		return messageService.updateMessage(message);	
	}
}
