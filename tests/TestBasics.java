public TestBasics {
    @Test
    public void testPostive1{
        Match match = new Match("player 1", "player 2");
        match.pointWonBy("player 1");
        match.pointWonBy("player 2");
        // this will return "0-0, 15-15"
        assertEquals(match.score(), "0-0, 15-15");

        match.pointWonBy("player 1");
        match.pointWonBy("player 1");
        // this will return "0-0, 40-15"
        assertEquals(match.score(), "0-0, 40-15");
        
        match.pointWonBy("player 2");
        match.pointWonBy("player 2");
        // this will return "0-0, Deuce"
        assertEquals(match.score(), "0-0, Deuce");
        
        match.pointWonBy("player 1");
        // this will return "0-0, Advantage player 1"
        assertEquals(match.score(), "0-0, Advantage player 1");
        
        match.pointWonBy("player 1");
        // this will return "1-0"
        assertEquals(match.score(), "1-0");
    }
}