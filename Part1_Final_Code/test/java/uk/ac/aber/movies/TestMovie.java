package uk.ac.aber.movies;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestMovie {

	@Test
	public void shouldBeInitialisedWithCorrectTitleAndPriceCode() {
		Movie movie = new Movie("Blade Runner (The Final Cut)", 
                MovieVersion.HD);
		
		
		assertEquals("Blade Runner (The Final Cut)", movie.getTitle());
		assertEquals(MovieVersion.HD, movie.getVersion());
	}
	
	@Test 
	public void shouldSetAndGetTitle() { 
		Movie movie = new Movie("Blade Runner (The Final Cut)", 
		        MovieVersion.HD);
		movie.setTitle("Blade Runner 2049");
		assertEquals("Blade Runner 2049", movie.getTitle());
	}
	
	@Test 
	public void shouldSetAndGetVersion() { 
		Movie movie = new Movie("Blade Runner (The Final Cut)", 
	            MovieVersion.HD);
		movie.setVersion(MovieVersion.SD);
		assertEquals(MovieVersion.SD, movie.getVersion()); 
	}

}
