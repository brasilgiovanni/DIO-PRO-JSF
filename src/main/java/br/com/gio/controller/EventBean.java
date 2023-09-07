package br.com.gio.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.gio.model.Event;

@Named
@SessionScoped
public class EventBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Event event;
	
	private List<Event> listEvent = new ArrayList<>();
	
	public String adicionarEvento() {
		listEvent.add(event);
		System.out.println("Evento cadastrado com sucesso! Nome = " + event.getNome());
		limparRegistro();
		return "";
	}
	
	public void limparRegistro() {
		this.event = new Event();
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public List<Event> getListEvent() {
		return listEvent;
	}

	public void setListEvent(List<Event> listEvent) {
		this.listEvent = listEvent;
	}
	
	
}
