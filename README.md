Elite Appliances Web Application

Part C: Customize the HTML User Interface

Prompt: Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

    File: mainscreen.html
        Lines 14 & 19: Updated to reflect the business name "Elite Appliances".
        Details: The user interface now displays the shop name, product names, and part names, ensuring a cohesive branding experience.
Part D: Add an "About" Page

Prompt: Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

    File: mainscreen.html
        Line 20: Added a link to about.html.
    File: mainscreencontroller.java
        Lines 55-60: Added @GetMapping to route to the About page.
    File: about.html
        Created a new page to describe Elite Appliances.
        Added CSS for styling and a link back to the main screen.
        Details: This page provides information about the company and includes navigation to and from the main screen.

Part E: Add a Sample Inventory

Prompt: Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

    File: Boostrapdata.java
        Lines 3-180: Added five inhouse parts and five outsourced parts and five products without overwriting existing data.
        Parts:
            Heavy Duty Gearbox
            Microprocessor Controller
            Filtration Unit
            Digital Control Panel
            Pressure Release Valve
            Power Capacitor
            High Efficiency Motor
            LED Display Panel
            Water Pump Assembly
            Temperature Sensor Module
        Products:
            Fridge
            Dishwasher
            Washing Machine
            Dishwasher
            Microwave

Part F: Add a "Buy Now" Button

Prompt: Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:

    The “Buy Now” button must be next to the buttons that update and delete products.

    The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.

    Display a message that indicates the success or failure of a purchase.

    File: mainscreen.html
        Line 94-97: Added a "Buy Now" button next to update and delete buttons.
        Line 82: Added Column

    File: addproductcontroller.java
        Lines 104-116: Added routing to HTML files for buy product and product confirmation screens, also made it work.

    Files Created:
        buysuccess.html: Displays product buy confirmation.
        buyfailure.html: Displays product error confirmation.

Part G: Modify the Parts to Track Maximum and Minimum Inventory

Prompt: Modify the parts to track maximum and minimum inventory by doing the following:

    Add additional fields to the part entity for maximum and minimum inventory.

    Modify the sample inventory to include the maximum and minimum fields.

    Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.

    Rename the file the persistent storage is saved to.

    Modify the code to enforce that the inventory is between or at the minimum and maximum value.

    File: mainscreen.html
        Lines 50-51: Added minimum and maximum fields.
        Lines 39-40: added min and max columns.
    File: part.java
        Lines 33-36: Added min call with variables.
        Lines 57-64: Added min and max to part class.
        Lines 86-89 & 106-109: Added min and max classes.

    Files:
        inhousepartform.html & outsourcedpartform.html
            Lines 26-27: Added min and max form elements.

    File: application.properties
        Updated datasource URL:

        spring.datasource.url=jdbc:h2:file:~/src/main/resources/spring-boot-h2-db102Willoughby112233445

    File: PartValidator & ValidPart
        Created annotation @ValidPart and PartValidator functionality to do exactly this. It goes off if the part is either between the min or max with the message "Check min max rules and update your inventory"
    Files:
        inhousepartform.html & outsourcedpartform.html
        Lines 28-32: added error field for min max.


Part H:
Add validation for between or at the maximum and minimum fields. The validation must include the following:

Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.

Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.

Display error messages when adding and updating parts if the inventory is greater than the maximum.

I added some code in other classes trying to make this work. I couldn't get this to work for several days but now it does. I am unsure if removing the extra code does anything, however the functionality is there.

File AddInhousePartController & AddOutsourcedPartController.java: lines 41-55 is an example of this.
File outsourcedpart.java lines 16-34 is also an example.

Delete Files: PartValidator & ValidPart:
Create New Files: UnifiedValidator & ValidProductOrPart.
    These files now work for the product and the part and validates the part between min and max in partforms and productform.
Create new file CustomErrorController &error.html:
Needed to fix problem with productform not showing errors correctly.
File: Part.Java
Line 23: added @ValidProductOrPart annotation.

Part I: Add Unit Tests for Maximum and Minimum Fields

Prompt: Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

    File: parttest.java
        Lines 161-178: Added tests for min and max values to ensure inventory is correctly validated.

Part J: Delete any unused validators to clean up code.
    File: DeletePartValidator
    File: ValidDeletePart
        This is unused so it's now gone.
