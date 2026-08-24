# Product scope

## Roles

| Role | Permissions |
| --- | --- |
| `ADMIN` | Manage users, catalog, inventory, and orders. |
| `OPERATOR` | Read the catalog, manage inventory, and process orders. |

## Domains

### Catalog

Categories organize products. Products include a unique SKU, name, optional description, price, and active status.

### Inventory

Each product has an available balance and a movement history. Supported operations include inbound stock, outbound stock, reservations, releases, and adjustments. Inventory must never become negative.

### Orders

Orders contain items, quantities, and the item price at the time of creation.

```text
CREATED -> CONFIRMED -> SHIPPED
    |          |
    +------> CANCELLED
```

Confirming an order reserves or deducts inventory. Cancelling a confirmed order restores the corresponding balance.

## Quality requirements

- Database migrations must recreate the schema from an empty database.
- The API must provide OpenAPI documentation.
- Error responses must follow a consistent format.
- Inventory and order rules must be covered by unit and integration tests.
- GitHub Actions must run the test suite for every pull request.
- The application must run locally with Java and Docker only.
