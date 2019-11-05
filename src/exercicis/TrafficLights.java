package exercicis;

import java.util.Arrays;

/*
Overview
A character string represents a city road.

Cars travel on the road obeying the traffic lights..

Legend:

. = Road
C = Car
G = GREEN traffic light
O = ORANGE traffic light
R = RED traffic light
Something like this:

C...R............G......
Rules
Simulation
At each iteration:

the lights change, according to the traffic light rules... then
the car moves, obeying the car rules
Traffic Light Rules
Traffic lights change colour as follows:

GREEN for 5 time units... then
ORANGE for 1 time unit... then
RED for 5 time units....
... and repeat the cycle
Car Rules
Cars travel left to right on the road, moving 1 character position per time unit
Cars can move freely until they come to a traffic light. Then:
if the light is GREEN they can move forward (temporarily occupying the same cell as the light)
if the light is ORANGE then they must stop (if they have already entered the intersection they can continue through)
if the light is RED the car must stop until the light turns GREEN again
Kata Task
Given the initial state of the road, return the states for all iterations of the simiulation.

Input
road = the road array
n = how many time units to simulate (n >= 0)
Output
An array containing the road states at every iteration (including the initial state)
Note: If a car occupies the same position as a traffic light then show only the car
Notes
There is only one car
For the initial road state
the car is always at the first character position
traffic lights are either GREEN or RED, and are at the beginning of their countdown cycles
There are no reaction delays - when the lights change the car drivers will react immediately!
If the car goes off the end of the road it just disappears from view
There will always be some road between adjacent traffic lights
Example
Run simulation for 10 time units

Input

road = "C...R............G......"
n = 10
Result

[
  "C...R............G......", // 0 initial state as passed
  ".C..R............G......", // 1
  "..C.R............G......", // 2
  "...CR............G......", // 3
  "...CR............G......", // 4
  "....C............O......", // 5 show the car, not the light
  "....GC...........R......", // 6
  "....G.C..........R......", // 7
  "....G..C.........R......", // 8
  "....G...C........R......", // 9
  "....O....C.......R......"  // 10
]
 */
public class TrafficLights {
	public static String[] trafficLights(String road, int n) {
	    int timer = 0;
	    boolean car = true;
	    String[] road2 = road.split("");
	    String[] posicions = new String[n + 1];
	    int posicio = 0;
	    String solapat = ".";
	    posicions[0] = road;
	    for (int i = 0; i < n; i++) {
	      if (car) road2[posicio] = solapat;
	      for (int r = 0; r < road.length(); r++) {
	        if ((road2[r].equals("R")) && (timer == 4 || timer == 10)) {
	          road2[r] = "G";
	        } else if (road2[r].equals("O")) {
	          road2[r] = "R";
	        } else if (road2[r].equals("G") && (timer == 4 || timer == 9)) {
	          road2[r] = "O";
	        }

	      }
	      if (posicio < (road2.length-1)) {
	      if (!(road2[posicio + 1].equals("R")) && !(road2[posicio + 1].equals("O"))) {
	        solapat = road2[posicio + 1];
	        road2[posicio + 1] = "C";
	        posicio++;
	      }else road2[posicio] = "C";
	      }else car=false;
	      String road3 = Arrays.toString(road2).replace(",", "").replace(" ", "").replace("[", "").replace("]", "");
	      System.out.println(road3);
	      posicions[i + 1] = road3;
	      
	      timer++;
	      if(timer==11) timer=0;
	    }

	    return posicions;
	  }
	}

