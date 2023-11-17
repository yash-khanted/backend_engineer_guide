# Hyper Text Markup Langunage
A markup language which describes the structure of a web page to be displayed by browser. The language is collection of html elements, an element is the brick of html.
# HTML element
Every html element is made
- opening tag
- attributes
- content
- closing tag

Elements are nested within each other to create the structure.
Keypoints:
- HTML elements/ tags are not case sensitive
- Whitespace has no meaning, HTML care for only indentation.
-  void elements - these element do not have a content and so the closing tag is simply not required, An oblique is used instead the end bracket of the opening tag. Mostly used for embedding content. The img, br etc.

### Attributes
These hold information about the html element. By analogy, consider html element as noun then the attribute is considered as the adjective.
- THese are key-value pairs.
- Ex., key="value" | rel="stylesheet" | src="http://"
- Boolean attributes - some attributes do not need values. Like disabled attribute in button element. They just represent true or false. If included in the tag it means true, if not included in the element it means false
- Use single quotes or double quotes. In general, double quotes are used so that single quotes can be used in spcail cased for attribute values

# Comments in HTML
```html
<!-- this is comment in html
it could be a single line aor spread over line
until it between these two tags -->
<html>
    <head></head>
    <body></body>
</html>
``` 
# html element
wrap the whole html document

# head element
This html element is used to describe information about the html document. The content inside this element will not be shown by the browser
This aa metadata for the html document

## meta element
this element hold information that cannot be captured by other element. Like character set to be used, author of the page, description of the page

This element can also be used for create a object in the social graph of facebeook and twitter.
refer open graph protocol by facebook and twitter cards by twitter.

charset="UTF-8" this attribute specifies the character set to be used by the html page. UTF-8 is global standard file of characters depicting almost all the character read by human

name="author", name attribute is like a key to explain what content attribute store. specifies what the meta element is about

content="user text", this attribute hold the text. See below example for better picture. Hold the actual content of the meta element

```html
<meta name="author" content="yash.jainn.sanghvi">
<meta
    name="description"
    content="this is a site explaining the html bassics">
```
## Link element
this html element link the any file
rel="stylesheet" this attribute expalin the file typp/ file usage
href="file path on server"

use link for including the favicon. Or other icon sizes

## script element
for enclosing the javascript file
src="script file path on the server"
defer, a boolean attribute for instructing browser to load the javascript file only after html is parsed