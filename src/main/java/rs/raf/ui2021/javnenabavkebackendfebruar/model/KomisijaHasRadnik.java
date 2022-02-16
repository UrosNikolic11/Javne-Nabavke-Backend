package rs.raf.ui2021.javnenabavkebackendfebruar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "komisijaHasRadnik")
public class KomisijaHasRadnik {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;
	   
	   @ManyToOne
	   @JoinColumn(name = "radnik_id",referencedColumnName = "id")
	   private Radnik radnik;

}
