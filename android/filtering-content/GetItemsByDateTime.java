// DocSection: filtering_get_items_by_datetime
// Note: system.last_modified value is stored with ms precision
// Date&Time element value is stored with minute precision
List<ContentItem> items1 = deliveryService.<ContentItem>items()
    // Gets items modified after April 9 2020, 9 am UTC+0
    .greaterThanFilter("system.last_modified", "2020-05-09T09:00:00.000000Z")
    .get()
    .getItems();

List<ContentItem> items2 = deliveryService.<ContentItem>items()
    // Gets items released at or after April 9 2020, 7 am UTC+0
    .greaterThanOrEqualFilter("elements.release_date", "2020-05-09T07:00:00Z")
    .get()
    .getItems();

List<ContentItem> items3 = deliveryService.<ContentItem>items()
    // Gets items modified before April 5 2020 UTC+0
    // Last match would be at 2020-05-04T23:59:59
    .lessThanFilter("system.last_modified", "2020-05-05")
    .get()
    .getItems();

List<ContentItem> items4 = deliveryService.<ContentItem>items()
    // Gets items released at or before April 5 2020 10:30 am UTC+0
    .lessThanOrEqualFilter("elements.release_date", "2020-05-05T10:30:00Z")
    .get()
    .getItems();
// EndDocSection 