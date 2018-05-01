$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/feature/feature.feature");
formatter.feature({
  "name": "Tatoc course",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Selection of coruse type i.e, advance",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Open browser and start application Tatoc",
  "keyword": "Given "
});
formatter.match({
  "location": "CourseSelection.open_browser_and_start_application_Tatoc()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on advance course",
  "keyword": "When "
});
formatter.match({
  "location": "CourseSelection.click_on_advance_course()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigated to hover menu",
  "keyword": "Then "
});
formatter.match({
  "location": "CourseSelection.navigated_to_hover_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Select \u0027Go Next\u0027 from \u0027Menu 2\u0027 to proceed",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Hover on \u0027menu 2\u0027 and click on \u0027Go next\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "HoverMenu.hover_on_menu_and_click_on_Go_next(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigated to query gate",
  "keyword": "Then "
});
formatter.match({
  "location": "HoverMenu.navigated_to_query_gate()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Query the mysql database at 10.0.1.86 to get the \u0027Name\u0027 and \u0027PassKey\u0027 matching the provided \u0027Symbol\u0027",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Symbol text on query gate",
  "keyword": "Given "
});
formatter.match({
  "location": "QueryGate.symbol_text_on_query_gate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "connection is established",
  "keyword": "When "
});
formatter.match({
  "location": "QueryGate.connection_is_established()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check the number of column in tables And fetch the name and passkey",
  "keyword": "Then "
});
formatter.match({
  "location": "QueryGate.check_the_number_of_column_in_tables_And_fetch_the_name_and_passkey()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fill the fetched credentials",
  "keyword": "And "
});
formatter.match({
  "location": "QueryGate.fill_the_fetched_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "proceed to next page",
  "keyword": "And "
});
formatter.match({
  "location": "QueryGate.proceed_to_next_page()"
});
formatter.result({
  "status": "passed"
});
});