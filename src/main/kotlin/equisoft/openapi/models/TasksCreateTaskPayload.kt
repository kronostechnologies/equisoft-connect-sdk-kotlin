/**
* Equisoft /connect API
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: latest
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package equisoft/openapi.models


import com.squareup.moshi.Json

/**
 * 
 * @param subject Subject/Title of the Event.
 * @param ownerIds Ids of the owner users of the task.
 * @param isCompleted Is the task completed.
 * @param dueDate Date the task is expected to be done. As defined by full-date - RFC3339
 * @param initialDate Date the task was initially started. As defined by full-date - RFC3339
 * @param completedDate Date the task was completed / done. As defined by full-date - RFC3339
 * @param description Public description of the Event.
 * @param internalNotes Internal notes on the Event. Not synced on remote sources.
 * @param categoryId ID of the field value to use as category.
 * @param subCategoryId ID of the field value to use as sub-category.
 * @param priority Importance/Priority of an event or task. 5 is the most important.
 * @param visibility Confidentiality level of the Event (private or not). [NORMAL, PRIVATE]
 * @param contactIds Allow to link the task to one or many contacts.
 */

data class TasksCreateTaskPayload (
    /* Subject/Title of the Event. */
    @Json(name = "subject")
    val subject: kotlin.String,
    /* Ids of the owner users of the task. */
    @Json(name = "ownerIds")
    val ownerIds: kotlin.collections.List<kotlin.Int>? = null,
    /* Is the task completed. */
    @Json(name = "isCompleted")
    val isCompleted: kotlin.Boolean? = null,
    /* Date the task is expected to be done. As defined by full-date - RFC3339 */
    @Json(name = "dueDate")
    val dueDate: kotlin.String? = null,
    /* Date the task was initially started. As defined by full-date - RFC3339 */
    @Json(name = "initialDate")
    val initialDate: kotlin.String? = null,
    /* Date the task was completed / done. As defined by full-date - RFC3339 */
    @Json(name = "completedDate")
    val completedDate: kotlin.String? = null,
    /* Public description of the Event. */
    @Json(name = "description")
    val description: kotlin.String? = null,
    /* Internal notes on the Event. Not synced on remote sources. */
    @Json(name = "internalNotes")
    val internalNotes: kotlin.String? = null,
    /* ID of the field value to use as category. */
    @Json(name = "categoryId")
    val categoryId: kotlin.Int? = null,
    /* ID of the field value to use as sub-category. */
    @Json(name = "subCategoryId")
    val subCategoryId: kotlin.Int? = null,
    /* Importance/Priority of an event or task. 5 is the most important. */
    @Json(name = "priority")
    val priority: kotlin.Int? = null,
    /* Confidentiality level of the Event (private or not). [NORMAL, PRIVATE] */
    @Json(name = "visibility")
    val visibility: kotlin.String? = null,
    /* Allow to link the task to one or many contacts. */
    @Json(name = "contactIds")
    val contactIds: kotlin.collections.List<kotlin.Int>? = null
)

