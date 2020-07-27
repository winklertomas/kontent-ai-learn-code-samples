<?php
// DocSection: filtering_get_items_by_string_element_value
$items = $client->getItems((new QueryParams())
    // Gets items whose Title element value equals to "Hello World"
    ->equals("elements.title", "Hello World")
// EndDocSection
?>