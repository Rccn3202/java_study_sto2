package javaHeight03.p675;

public class Movie2 implements Comparable<Movie2> {

		private String movieName;
		private Integer ticket;
		
		@Override
		public int compareTo(Movie2 o) {
		return movieName.compareTo(o.movieName);
		}
		
		public Movie2(String movieName, Integer ticket) {
			this.movieName = movieName;
			this.ticket = ticket;
		}

		public String getMovieName() {
			return movieName;
		}

		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}

		public Integer getTicket() {
			return ticket;
		}

		public void setTicket(Integer ticket) {
			this.ticket = ticket;
		}
		
		
		
	}

