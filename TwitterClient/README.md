## Dec 8, 2015

Time spent: 8 hours spent in total

Completed user stories:

 * [x] Required: User can sign in to Twitter using OAuth login
 * [x] Required: User can view the tweets from their home timeline
 * [x] Required: User should be displayed the username, name, and body for each tweet
 * [ ] Required: (PARTIAL) User should be displayed the relative timestamp for each tweet "8m", "7h"
 * [x] Required: User can view more tweets as they scroll with infinite pagination
 * [x] Required: User can compose a new tweet
 * [ ] Required: (PARTIAL, USING A TEXT INSTEAD) User can click a “Compose” icon in the Action Bar on the top right
 * [x] Required: User can then enter a new tweet and post this to twitter
 * [x] Required: User is taken back to home timeline with new tweet visible in timeline
 * [ ] Optional: While composing a tweet, user can see a character counter with characters remaining for tweet out of 140
 * [ ] Optional: Links in tweets are clickable and will launch the web browser (see autolink)
 * [x] Optional: User can refresh tweets timeline by pulling down to refresh (i.e pull-to-refresh)
 * [ ] Optional: User can open the twitter app offline and see last loaded tweets
 * [ ] Optional: User can tap a tweet to display a "detailed" view of that tweet
 * [ ] Optional: User can select "reply" from detail view to respond to a tweet
 * [ ] Optional: Improve the user interface and theme the app to feel "twitter branded"
 * [ ] Optional: User can see embedded image media within the tweet detail view
 * [ ] Optional: Compose activity is replaced with a modal overlay
 
 
Notes:

* What's up with the late submission? There's a lot going on at work today that needs my attention. In addition to that, I was stupidly stuck at Bad Authorization because I was trying to get rid of the "deprecated" Header in android-async-http client by bumping it to 1.4.9.
* I know this is lame, but I was facing `{"errors":[{"message":"Rate limit exceeded","code":88}]}`. So, it also delayed this submission...
* I can't seem to correctly display the relative time. Maybe it's because I messed up with my emulator timezone or something?

Walkthrough of all user stories:

![Video Walkthrough](http://i.imgur.com/zRD8DPL.gif)

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Dec 10, 2015

Time spent: 3.5+ hours spent in total

Completed user stories:

 * [x] Required: User can switch between Timeline and Mention views using tabs.
 * [x] Required: User can navigate to view their own profile
 * [x] Required: User can click on the profile image in any tweet to see another user's profile.
 * [x] Required: User can infinitely paginate any of these timelines (home, mentions, user) by scrolling to the bottom
 * OPTIONALS: did not do


Notes:

* I wasn't able to do shared transition correctly somehow...
* I have no idea why the swipe refresh layout indicator is hidden behind the tab. The reason why I don't add progress bar is because I want the swipe refresh layout indicator to show up. But during the first load, it's hidden behind the tabs.

Walkthrough of all user stories:

![Video Walkthrough](http://i.imgur.com/emuYyGY.gif)

GIF created with [LiceCap](http://www.cockos.com/licecap/).
