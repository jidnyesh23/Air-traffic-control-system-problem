# Air-traffic-control-system-problem
Problem Statement: An airport needs to manage multiple flights including scheduling arrivals and departure and avoiding runway conflicts.

**The Greedy Algorithm for this problem would focus on minimizing runway conflicts by prioritizing flights based on certain criteria, such as the earliest departure or arrival time. In this case, a typical greedy approach would choose the flight that uses the runway next and doesn't conflict with the already scheduled flights.**

**The steps in the algorithm would be:**

    1.Sort flights based on arrival or departure times.
    2.Iterate through the sorted list of flights and assign them to the runway based on availability.
    3.Avoid conflicts by checking if the flight's arrival or departure time overlaps with an already scheduled flight.

**Key Points:**

    Flights should be sorted by arrival time, and the runway will be allocated to the first flight that doesn't conflict with the previous one.
    The algorithm doesn't always guarantee the globally optimal solution but works well for many real-world scheduling problems.

**Example Problem:**

Assume we have several flights, and each flight has an arrival and departure time. We want to schedule the flights in such a way that there are no conflicts on the runway. Here's an example:

    Flight 1: Arrives at 1:00, departs at 2:00
    Flight 2: Arrives at 1:30, departs at 3:00
    Flight 3: Arrives at 2:30, departs at 4:00
    Flight 4: Arrives at 3:00, departs at 4:30

**Approach:**

    Sort the flights by arrival time: [Flight 1, Flight 2, Flight 3, Flight 4]
    Schedule the first flight.
    For each subsequent flight, check if it conflicts with the last scheduled flight's departure time.

**Explanation of the Code:**

    Flight Class:
        This class holds the arrival and departure times for each flight.
    scheduleFlights Method:
        First, the list of flights is sorted based on the arrival time.
        Then, we iterate through the sorted list of flights, and we check if the current flight’s arrival time is greater than or equal to the previous flight’s departure time.
        If there is no conflict, the flight is added to the scheduled list.
    Main Method:
        A list of sample flights is created and passed to the scheduleFlights method to schedule them.

**Output:**

For the given input:

    Flight 1: Arrives at 1:00, departs at 2:00
    Flight 2: Arrives at 1:30, departs at 3:00
    Flight 3: Arrives at 2:30, departs at 4:00
    Flight 4: Arrives at 3:00, departs at 4:30

The algorithm will output the scheduled flights:

Scheduled Flights (Arrival - Departure):
1 - 2
2 - 4

**Key Observations:**

    Flight 1 (1:00 - 2:00) is scheduled first.
    Flight 3 (2:30 - 4:00) is scheduled after Flight 1, as it does not conflict.
    Flight 2 (1:30 - 3:00) is not scheduled because it overlaps with Flight 1 (arrives before Flight 1 departs).
    Flight 4 (3:00 - 4:30) is skipped as it conflicts with Flight 3.

This greedy approach provides a simple and efficient solution, where flights are scheduled based on earliest availability, avoiding conflicts on the runway.
