# Angular
- It is a javascript framework developed by google
- Component based web application development. Mainly single page web application development.
- Angular can installed with npm

create a new project with below CLI command
```ng create <project-name>```

create a new component using the following CLI command
```ng generate component <component-name>```

## Binding
A process of connecting data, properties or event with HTML and javascript codebases
### data binding
Any variables declared in the javascript can be interpolated or represented in the HTML using the following syntax in the HTML
"{{ variable-name }}". The double curly brackets are called delimeters and be changed accordingly. 
Anything passed in this is considered as javascript identifier by angular
### Property binding
By using "[property-name]", a map of property can be assigned to HTML attributes. See the below code for example
```javascript
//Map created in the JS file with key depicting class name and value as the truthiness
classList = [
    container: true,
    bg-bold: true,
    dark-color: false
]

<HTML>
    <div [ngClass]="classList">
</HTML>
```
### event binding
Anything inside "(event-name)" will be specified as an event and event handler will be passed in double quoted
### Two way data binding
It is possible in angular to have two way data binding using the ngModel directive.

NgModel directive helps in ensuring two way data binding. There are two ways to perform data binding

1. Event binding and property binding\
    [ngMode] = "stock.name"\
    (ngModelChange) = "stock.name=$event"
2. Banana in a box syntax
   1. [( ngModel )] = "stock.name" this syntax helps in assigning both the above line in a single statement

## Directives
A directive helps attach some custom functionality to HTML elements
Two types
### Component Directives
This provides functionality and UI logic, fundamentally an element that encapsulates its behaviour and rendering logic
### NonCompoent drective
Works to modify existing HTML elements
#### Structural Directive
change the DOM layout by adding or removing elements Ex.
All structural directive start with asterisk(*) in the start before use 
##### NgIf
```html
<div *ngIf = "2 < 3"></div>
```
##### NgFor
```html
<div *ngFor = " let stock of stocks; index as i; trackBy stock.stockCode>
```
trackBy feature is used to change the strategy for change detection mechanism to detect changes on an object on a property of object from object references.
##### NgSwitch
ngSwitch is an attribute directive while it combines with ngSwitchCase and ng SwitchDefault to become collectively a structural directive.
#### Attribute Directive
Attribute directive change the look and feel, the behaviour of an existing element or component that is applied on Ex. 
##### NgClass
helps to remove or add multiple classes to an existing element
A key value pair with key representing the class name and the value representing the truthiness value
##### NgStyle
helps add multiple styles to an existing element
A key value pair matching the exact CSS property name and value is passed

## Components
- Angular application is a tree of components
- Component is a JS class with HTML template and CSS sheet
  - It tell what data to load
  - What to render
  - How to respond to the UI events
- @component decorator annotates a JS class as component class
  - selector: It is the name to identify the component in the project
  - stand-alone: tells angular that component is independent of any module
  - template/templateUrl: An HTML template link or code
  - styles/styleUrls: an list of CSS sheets
  - imports: allows to specify the modules that you want to be imported and accessible

## Input and Output
These decorators helps specify input to an element. Using the @Input decorator on any variable declared in the JS file will become an HTML property for that component

Interface Method Applicable to Purpose
OnChanges ngOn
Changes(changes:
SimpleChange)
Components
and directives
ngOnChanges is called both right after the constructor to
set and then later every time the input properties to a directive
change. It is called before the ngOnInit method.
OnInit ngOnInit() Components
and directives
This is your typical initialization hook, allowing you to do any
one-time initialization specific to your component or directive.
This is the ideal place to load data from the server and so on,
rather than the constructor, both for separation of concerns as
well as testability.
72 | Chapter 4: Understanding and Using Angular ComponentsInterface Method Applicable to Purpose
DoCheck ngDoCheck() Components
and directives
DoCheck is Angular’s way of giving the component a way to
check if there are any bindings or changes that Angular can’t
or should not detect on its own. This is one of the ways we can
use to notify Angular of a change in the component, when we
override the default ChangeDetectionStrategy for a
component from Default to OnPush.
After
Content
Init
ngAfterContent
Init()
Components
only
As mentioned, the AfterContentInit hook is triggered
during component projection cases, and only once during
initialization of the component. If there is no projection, this is
triggered immediately.
After
Content
Checked
ngAfterContent
Checked()
Components
only
AfterContentChecked is triggered each time Angular’s
change detection cycle executes, and in case it is initialization,
it is triggered right after the AfterContentInit hook.
AfterView
Init
ngAfterViewInit() Components
only
AfterViewInit is the complement to AfterContent
Init, and is triggered after all the child components that are
directly used in the template of the component are finished
initializing and their views updated with bindings. This may
not necessarily mean that the views are rendered into the
browser, but that Angular has finished updating its internal
views to render as soon as possible. AfterViewInit is
triggered only once during the load of the component.
AfterView
Checked
ngAfterView
Checked()
Components
only
AfterViewChecked is triggered each time after all the
child components have been checked and updated. Again, a
good way to think about both this and AfterContent
Checked is like a depth-first tree traversal, in that it will
execute only after all the children components’ AfterView
Checked hooks have finished executing.
OnDestroy ngOnDestroy() Components
and directives
The OnDestroy hook is called when a component is about
to be destroyed and removed from the UI. It is a good place to
do all cleanup, like unsubscribing any listeners you may have
initialized and the like. It is generally good practice to clean up
anything that you have registered (timers, observables, etc.) as
part of the component

### View Projection
Projection is useful when you want to build components but set some parts of the UI of the component not to be an innate part of it
In the child component add the ""<ng-content></ng-content>" tag

In the parent component inside the child selector tags add the extra UI part into it

# Forms
There are two types of forms that are created in angular
## Template driven forms
A simple well defined form created in HTML changes to the form is difficult

## reactive form
Here you define the treee of angular form control objects in your component code and then bind them to native form control elements in your template

Reactive forms are synchronous, as a developer have absolute control over how and when the data is synched from the UI to the model and vice versa

FormControl represents indivisual form element in the template
FormGroup is a group class of form control elements
FormBulider is class with build method that generates the from from a simple dictionary of FormControl objects
## Form validation
control state and control valiity
refer doc
```
## Reactive forms

## Angular Services
angular services are used to 