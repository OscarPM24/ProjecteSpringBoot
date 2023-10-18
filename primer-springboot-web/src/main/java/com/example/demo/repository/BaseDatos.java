package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Iterator;

import com.example.demo.bean.Libro;

public class BaseDatos {
	ArrayList<Libro> libros = new ArrayList<Libro>();
	
	public BaseDatos() {
		libros.add(new Libro(1,"asd","asd","asd","asd","asd"));
		libros.add(new Libro(2,"sdf","sdf","sdf","sdf","sdf"));
	}
	
	public ArrayList<Libro> getLibros() {
		return libros;
	}
	
	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	
	public Libro getLibro(int id) {
		for (int i=0;i<libros.size();i++) {
			Libro libro = libros.get(i);
			if (libro.getId()==id) {
				return libro;
			}
		}
		return null;
	}
	
	public void inserta(Libro libro) {
		libros.add(libro);
	}
	
	public void borrar(int id) {
		Iterator<Libro> it = libros.iterator();
		while (it.hasNext()) {
			Libro li = it.next();
			if (li.getId()==id) {
				it.remove();
				break;
			}
		}
	}
	
	public void modifica(Libro libro) {
		Iterator<Libro> it = libros.iterator();
		while (it.hasNext()) {
			Libro li = it.next();
			if (li.getId()==libro.getId()) {
				li.setTitulo(libro.getTitulo());
				li.setAutor(libro.getAutor());
				li.setEditorial(libro.getEditorial());
				li.setFecha(libro.getFecha());
				li.setTematica(libro.getTematica());
				break;
			}
		}
	}
}
