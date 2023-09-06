## EggTimer ##

EggTimer is a timer app for cooking eggs.
You can start and stop the timer and choose different cooking intervals based on how much boiled you
want your eggs to be. When the timer finishers you will be notified with a notification.

The app demonstrates the use of Notification Manager and Channels to deliver notifications.

## App Preview ##

<img alt="Egg Timer App Preview 1" src="https://github.com/pawanharariya/Egg-Timer/assets/43620548/591ee274-70e7-4d94-8ebb-a013da675b4c" width=250/>
<img alt="Egg Timer App Preview 2" src="https://github.com/pawanharariya/Egg-Timer/assets/43620548/46938a81-027c-4fec-96b9-a85aaeffffb6" width=250/>

## Notifications ##

Notifications are messages shown outside of the app's UI. Notifications can be used as reminders, to
notify something has happened or communicate important information. A notification is shown at
following places in different formats:

- As icon in the status bar
- Detailed entry in the notification drawer
- As badge on app's icon
- On paired wearable devices.
- Important notifications can also be shown as heads up - a pop up at top of the screen.

A notification contains title, description and an icon. It can also contain clickable actions, quick
reply, extendable content and images. Notifications are created using Notification Builder.

## Notification Manager ##

Notification Manager is a system service that is used for displaying notifications, updating its
contents, and canceling the notification.

## Notification ID ##

The notification id represents the current notification instance, it is used for updating and
canceling the notification. If the app has only one active notification at a time, we can use same
id for all notifications.

## Notification Channel ##

Channels represent a type of notification. All notifications in a channel are grouped together,
allowing users to configure notification settings for the whole channel based on the type of
notification they are interested in. For example, users can disable the channel that has low
priority notifications. Developers set importance and behaviour of a channel as part of initial
settings, but the user can override these settings. From API level 26, all notifications must be
assigned to a channel. Channels are used to customise the settings and behaviour for all
notifications sent on a channel. Customisation includes enabling lights, enabling vibration, or
color of light, when notifications are received. Channels have Channel Id and Channel name. Channel
name is also displayed to the user in settings for customising the channel.

## Intents ##

An intent is a messaging object used to request an action from another app component. Intents can be
used to start an activity, a service or delivering a broadcast. Intents can be you used to open the
app when the notification is clicked.

### Pending Intent ###

A pending intent grants rights to another application or the system to perform the operation on
behalf of our app. Pending is reference maintained by the system describing original data used to
retrieve it. So even when the owner application process is killed, the pending intent is usable from
other processes. The Android system uses the pending intent to open the app, even when the app is
not running. Pending Intents are also used to perform functions on the app directly from the
notification actions, without needing to launch the app.

## Notification Importance ##

Notification importance is necessary because it determines how much the notification should
interrupt the user visually and audibly. The importance level is specified in the notification
channel constructor, and it is applied to all notifications posted on that channel. Once the channel
is created, it is exposed to the user and then the user have full control over the channel,
including notification importance.

## Push Notifications ##

Push Notifications are notifications that the server pushes to the mobile device, instead of the
client fetching. They can be delivered even if the app isn't running.

### Publish-Subscribe Pattern ###

Push notifications follow publish-subscribe pattern. Without this model, the client will have to
periodically check for updates from backend server. This can result in waste of network and
processing resources both for client and server. So, in publish-subscribe model the client
subscribes and is notified for updates. The server can push relevant content to
interested/subscribed clients.