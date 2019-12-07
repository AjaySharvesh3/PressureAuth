# PressureAuth

## Inspiration
Today it is very hard to hide our PIN from the third person, we may share our pin to the third person without our knowledge. To solve this problem, we came with an idea called PressureAuth.

## What it does
PressureAuth is used to have your PIN along with the pressure you made for each PIN. 

## How we built it
We implemented this in Android using Android Studio. 
We used the MotionEvent Library in Android to measure the Pressure. 

## Challenges we ran into
We faced calculating the pressure because there is no Touch Event pressure detection library in android. We created a function to measure the pressure along with the duration that the user presses the button.

## Accomplishments that we're proud of
We created a demo app for this. Handled error, and it works fine. 

## What we learned
We understand the MotionEvent Library and learned that there is no touch event handler in the android library. We learn to start creating new one for it, without involving in hardware parts.

## What's next for PressureAuth
Currently, it's in the application, we should convert this into Services to protect other applications. 
