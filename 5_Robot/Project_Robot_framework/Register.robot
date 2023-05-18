*** Settings ***
Library  SeleniumLibrary
Library  Seleniumlibrary

*** Variables ***
${LOGIN URL}          http://automationpractice.com/index.php
${BROWSER}      Chrome
${SIGN IN}  http://automationpractice.com/index.php
${DELAY}  3
@{SPEC CHARS}=  !   @   \#   $   %  ^   &   *   (   )   _   +   {   }   :   "   |   <   >   ?   [   ]   ;   '   \   ,   .   /
@{EMAILS SAMPLE}=  simpletext   1234   @   @.   @.pl  simpletext@.   simpletext@.@   simpletext@   simpletext@check   simpletext@check.   simpletext@check.@   simpletext@ch@ck   simpl#txt@check.pl   simpletext@ch$ck   simplet#xt@ch$ck   simpletext@check.com9   simpletext@check.@   simpletext@check.#   simpletext@check.c^m   simpletext@check.7com   !   @   \#   $   %  ^   &   *   (   )   _   +   {   }   :   "   |   <   >   ?   [   ]   ;   '   \   ,   .   /
@{PASSWORDS}=   1   12   123   1234

*** Test Cases ***
Open page with form
    Open main page
    Open login page
    Input valid email
    Submit form with email
    Assert register form appear

Check set Title
    Set Mr
    Set Mrs

Assert if first name is valid
    Log To Console  \n
    :FOR  ${item}  IN  @{SPEC CHARS}
    \   Input Text	id=customer_firstname   ${item}
    \   click element	id=customer_lastname
    \   sleep  0.2
    \   ${elem}  Get Webelement  css=.authentication.hide-left-column.hide-right-column.lang_en div#page div.columns-container div#columns.container div.row div#center_column.center_column.col-xs-12.col-sm-12 div#noSlide form#account-creation_form.std.box div.account_creation input#customer_firstname.is_required.validate.form-control
    \   ${bg color}  Call Method    ${elem}     value_of_css_property   background-color
    \   Run Keyword If  '${bg color}'=='rgba(221, 249, 225, 1)'     Log To Console      Invalid character: '${item}' can be used in firstname field
    Input Text	id=customer_firstname   firstname

Assert if last name is valid
    Log To Console  \n
    :FOR  ${item}  IN  @{SPEC CHARS}
    \   Input Text	id=customer_lastname   ${item}
    \   click element	id=email
    \   sleep  0.2
    \   ${elem}  Get Webelement  css=.authentication.hide-left-column.hide-right-column.lang_en div#page div.columns-container div#columns.container div.row div#center_column.center_column.col-xs-12.col-sm-12 div#noSlide form#account-creation_form.std.box div.account_creation input#customer_lastname.is_required.validate.form-control
    \   ${bg color}  Call Method    ${elem}     value_of_css_property   background-color
    \   Run Keyword If  '${bg color}'=='rgba(221, 249, 225, 1)'     Log To Console      Invalid character: '${item}' can be used in lastname field
    Input Text	id=customer_lastname   lastname

Assert if email is valid
    Log To Console  \n
    :FOR  ${item}  IN  @{EMAILS SAMPLE}
    \   Input Text	id=email   ${item}
    \   click element	id=customer_lastname
    \   sleep  0.2
    \   ${elem}  Get Webelement  css=.authentication.hide-left-column.hide-right-column.lang_en div#page div.columns-container div#columns.container div.row div#center_column.center_column.col-xs-12.col-sm-12 div#noSlide form#account-creation_form.std.box div.account_creation input#email.is_required.validate.form-control
    \   ${bg color}  Call Method    ${elem}     value_of_css_property   background-color
    \   Run Keyword If  '${bg color}'=='rgba(221, 249, 225, 1)'     Log To Console      Invalid email: '${item}' can be used
    Input Text	id=email   example27@domain.com

Assert if password is valid
    Log To Console  \n
    :FOR  ${item}  IN  @{PASSWORDS}
    \   Input Text	id=passwd   ${item}
    \   click element	id=email
    \   sleep  0.2
    \   ${elem}  Get Webelement  css=.authentication.hide-left-column.hide-right-column.lang_en div#page div.columns-container div#columns.container div.row div#center_column.center_column.col-xs-12.col-sm-12 div#noSlide form#account-creation_form.std.box div.account_creation input#passwd.is_required.validate.form-control
    \   ${bg color}  Call Method    ${elem}     value_of_css_property   background-color
    \   Run Keyword If  '${bg color}'=='rgba(221, 249, 225, 1)'     Log To Console      Invalid password: '${item}' can be used
    Input Text	id=passwd   12345

Check date of birth
    Set day
    Set month
    Set year

Set checkboxes
    Check newsletter
    Check 3doffers

Set Company
    Check Company

Set Address
    Check first part of Address
    Check second part of Address

Set City
    Check city

Set State
    Check state

Set Zip Postal Code
    Check postal code

Set Country
    Check country

Set Additional Information
    Check information

Set Home Phone
    Check phone

Set Mobile Phone
    Check mobile phone

Set Alias
    Check alias

Send Completed Form
    Send form

*** Keywords ***
#Open page with form
Open main page
    Open browser    ${SIGN IN}   ${BROWSER}
    sleep  ${DELAY}
    Title Should Be   My Store
Open login page
    click element  class=login
    sleep  ${DELAY}
Input valid email
    Input Text	id=email_create	correct1@email.com
Submit form with email
    click element  name=SubmitCreate
    sleep  ${DELAY}
Assert register form appear
    page should contain element  id=customer_firstname

#Invalid login
Input invalid email
    Input Text	id=email_create  incorrectemail.pl
Assert register form not appear
    Title Should Be   Login - My Store

#set Title
Set Mr
    click element  id=uniform-id_gender1
Set Mrs
    click element  id=uniform-id_gender2

#Check date of birth
Set day
    Select from list by value  id=days  17
Set month
    sleep   0.2
    Select from list by value  id=months  5
Set year
    sleep   0.2
    Select from list by value  id=years  1988

#checkboxes
Check newsletter
    sleep   0.2
    click element  id=uniform-newsletter
Check 3doffers
    sleep   0.2
    click element  id=uniform-optin

#Set Company
Check company
    sleep   0.2
    Input Text	id=company  company

#Set Address
Check first part of Address
    sleep   0.2
    Input Text	id=address1  example street
Check second part of Address
    sleep   0.2
    Input Text	id=address2  111/321

#Set City
Check city
    sleep   0.2
    Input Text	id=city  somewhere

#Set state
Check state
    sleep   0.2
    Select from list by value  id=id_state  12

#Set Zip Postal Code
Check postal code
    sleep   0.2
    Input Text	id=postcode  11000

#Set Country
Check country
    sleep   0.2
    Select from list by value  id=id_country  21

#Set Additional Information
Check information
    sleep   0.2
    Input Text	id=other  Lorem ipsum dolor sit amet

#Set Home Phone
Check phone
    sleep   0.2
    Input Text	id=phone  123456789

#Set Mobile Phone
Check mobile phone
    sleep   0.2
    Input Text	id=phone_mobile  987654321

#Set Alias
Check alias
    sleep   0.2
    Input Text	id=alias  alias

#Send Completed Form
Send form
    sleep   0.2
    click element  name=submitAccount
    sleep   5
    #[Teardown]  Close Browser
