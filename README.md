This Sample two activity application contains  ACTIVITY-LIFECYCLE CONCEPTS

- To navigate transitions between stages of the activity lifecycle, the Activity class provides a core set of six callbacks:

- onCreate(), 
- onStart(), 
- onResume(),
- onPause(),
- onStop(), 
- onDestroy(). 

The system invokes each of these callbacks as an activity enters a new state.
###### A new instance of the activity will be created and have the following callbacks triggered:
onCreate(),
onStart(),
onResume()

######  When the user switches from app A to app B, the system calls onPause() on app A, and onResume() on app B. It switches between these two methods each time the user toggles between apps.
###### If a new activity or dialog appears in the foreground, taking focus and partially covering the activity in progress, the covered activity loses focus and enters the Paused state. Then, the system calls 
onPause() 
on it.If a new activity or dialog appears in the foreground, taking focus and partially covering the activity in progress, the covered activity loses focus and enters the Paused state. Then, the system calls onPause() on it.

When the covered activity returns to the foreground and regains focus, it calls onResume().

If a new activity or dialog appears in the foreground, taking focus and completely covering the activity in progress, the covered activity loses focus and enters the Stopped state. The system then, in rapid succession, calls onPause() and onStop().

##### When the same instance of the covered activity comes back to the foreground, the system calls onRestart(), onStart(), and onResume() on the activity. If it is a new instance of the covered activity that comes to the background, the system does not call onRestart(), only calling onStart() and onResume().

- ##### User presses or gestures Back
If an activity is in the foreground, and the user presses or gestures Back, the activity transitions through the onPause(), onStop(), and onDestroy() callbacks. In addition to being destroyed, the activity is also removed from the back stackIf an activity is in the foreground, and the user presses or gestures Back, the activity transitions through the onPause(), onStop(), and onDestroy() callbacks. In addition to being destroyed, the activity is also removed from the back stack.
