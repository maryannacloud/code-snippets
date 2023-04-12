import java.util.*;

/*
TASK:
You are given an array of system logs in a form of Strings. Format: {"Action:UserID", "Action:UserID", …}:

   String[] logs = {"A:1",
                "A:1",
                "A:2",
                "A:3",
                "A:1",
                "B:1",
                "B:1",
                "B:2",
                "B:3",
                "A:3",
                "C:3",
                "C:2",
                "C:1",
                "B:1",
                "C:1"
        };

   Given the following conditions, create a method that outputs all the users, which have experienced the error.
   Logs are in chronological order from when they have occurred. Remember: Letter = Action and Number = UserID.

   A => B => C => ERROR
   A => C => B => no error
   C => B => A => no error
   A => B => B => C => no error

Pseudo-code (approaches):

Okay, so In the task, we are given a sequence of logs containing actions (A, B, or C) and user IDs.
The goal is to find all users who experienced a specific error, which occurs when a user goes through the sequence of actions A => B => C.
We can solve this task using a couple of different approaches.

1. Using Map: we can iterate through the logs and use Map to track the state of each User. Then check for the error pattern.
   The idea of using userStates comes from analyzing the problem requirements and recognizing that we need to track the progress of each user through the sequence of actions.
   By maintaining the userStates HashMap, we can efficiently update and check the user's progress as we process the logs, ultimately finding all users who experienced the error.

2. Using Set: we can use three separate sets of Actions: A, B and C for each User.

3. Using Set and nested if (this would be a higher complexity solution, which is not recommended).
 */
public class UserLogs {
    public static void main(String[] args) {

        String[] logs = {"A:1",
                "A:1",
                "A:2",
                "A:3",
                "A:1",
                "B:1",
                "B:1",
                "B:2",
                "B:3",
                "A:3",
                "C:3",
                "C:2",
                "C:1",
                "B:1",
                "C:1"
        };

        List<Integer> usersWithErrorMap = findUsersWithErrorMap(logs);

        for (int userID : usersWithErrorMap){
            System.out.println("User " + userID + " experienced an error.");
        }

        Set<Integer> usersWithErrorSet = findUsersWithErrorSet(logs);

        for (int userId : usersWithErrorSet) {
            System.out.println("User " + userId + " experienced an error.");
        }

    }

    // Approach #1:
    public static List<Integer> findUsersWithErrorMap (String[] logs) {
        /*
        The idea of current User state is to keep track of the current sequence of actions each user has gone through.
        By using HashMap called "userStates", we can store the current state (sequence of actions) for each User. The key
        in the HashMap is the UserID, and the value is a String, that represents the sequence of actions.

        The following are the possible values for the userStates:
        1. "" (empty string): this means the user has not gone through any action yet.
        2. "A": The user has gone through action A, but not B or C.
        3. "AB": The user has gone through actions A and B, but not C.
        4. "ABC": The user has gone through actions A, B, and C, which means they have experienced the error.
         */
        Map<Integer, String > userStates = new HashMap<>();
        List <Integer> usersWithError = new ArrayList<>();

        for (String log : logs) {
            String[] logParts = log.split(":");
            String action = logParts[0];
            int userId = Integer.parseInt(logParts[1]);

            String currentState = userStates.getOrDefault(userId, "");

            /*
            As we iterate through the logs, we update the userStates HashMap for each user according to the action they have performed.
            */
            if ("A".equals(action)){
                currentState = "A";
            } else if ("B".equals(action) && "A".equals(currentState)){
                currentState = "AB";
            } else if ("C".equals(action) && "AB".equals(currentState)) {
                currentState = "ABC";
            }

            userStates.put(userId, currentState);

            /*
            If the user has reached the "ABC" state, we add their ID to the list of users who have experienced the error.
             */
            if ("ABC".equals(currentState) && !usersWithError.contains(userId)){
                usersWithError.add(userId);
            }
        }
        return usersWithError;
    }

    // Approach #2:
    public static Set<Integer> findUsersWithErrorSet (String [] logs ){
        // create three separate sets to store users for each action:
        Set <Integer> actionA = new HashSet<>();
        Set <Integer> actionB = new HashSet<>();
        Set <Integer> actionC = new HashSet<>();

        // create a set to store the users, who experienced an error:
        Set <Integer> usersWithErrors = new HashSet<>();

        // iterate through the logs:
        for (String log : logs) {
            String[] logParts = log.split(":");
            String action = logParts[0];
            int userId = Integer.parseInt(logParts[1]);

            // update the User sets based on the action:
            if ("A".equals(action)){
                actionA.add(userId);
                actionB.remove(userId);
                actionC.remove(userId);
            } else if ("B".equals(action) && actionA.contains(userId)){
                actionB.add(userId);
            } else if ("C".equals(action) && actionB.contains(userId)){
                actionC.add(userId);
                usersWithErrors.add(userId);
            }
        }
        return usersWithErrors;
    }

    // Approach #3:
    public static Set<Integer> findUsersWithErrors(String[] logs) {
        Set<Integer> usersWithErrors = new HashSet<>();
        Map<Integer, String> userIdWithActions = new HashMap<>();

        for (int i = 0; i < logs.length; i++) {
            if (userIdWithActions.containsKey(Integer.parseInt(logs[i].substring(2, 3)))) {
                String actions = userIdWithActions.get(Integer.parseInt(logs[i].substring(2, 3))) + (logs[i].substring(0, 1));
                userIdWithActions.put(Integer.parseInt(logs[i].substring(2, 3)), actions);

                if (userIdWithActions.get(Integer.parseInt(logs[i].substring(2, 3))).contains("ABC")) {
                    usersWithErrors.add(Integer.parseInt(logs[i].substring(2, 3)));
                }

            } else {
                userIdWithActions.put(Integer.parseInt(logs[i].substring(2, 3)), logs[i].substring(0, 1));
            }
        }
        System.out.println(userIdWithActions);
        return usersWithErrors;
    }
}
