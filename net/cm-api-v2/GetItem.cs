// DocSection: cm_api_v2_get_item
using KenticoCloud.ContentManagement;

ContentManagementOptions options = new ContentManagementOptions
{
    ApiKey = "<YOUR_API_KEY>",
    ProjectId = "<YOUR_PROJECT_ID>"
};

ContentManagementClient client = new ContentManagementClient(options);

ContentItemIdentifier identifier = ContentItemIdentifier.ById(Guid.Parse("f4b3fc05-e988-4dae-9ac1-a94aba566474"));
// ContentItemIdentifier identifier = ContentItemIdentifier.ByCodename("on_roasts");
// ContentItemIdentifier identifier = ContentItemIdentifier.ByExternalId("59713");

ContentItemModel responseItem = await client.GetContentItemAsync(identifier);
// EndDocSection