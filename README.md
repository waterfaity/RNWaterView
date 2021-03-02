
# react-native-waterview


git:https://github.com/waterfaity/RNWaterView

## Getting started

`$ npm install react-native-waterview --save`

### Mostly automatic installation

`$ react-native link react-native-waterview`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.waterfairy.waterview.RNWaterviewPackage;` to the imports at the top of the file
  - Add `new RNWaterviewPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-waterview'
  	project(':react-native-waterview').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-waterview/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-waterview')
  	```


## Usage
```javascript
import RNWaterview from 'react-native-waterview';

// TODO: What to do with the module?
RNWaterview;
```
  
