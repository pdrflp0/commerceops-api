# Contribution guidelines

## Branches

- `main`: stable, review-ready code
- `feat/<number>-<description>`: new functionality
- `fix/<number>-<description>`: bug fixes
- `docs/<number>-<description>`: documentation changes

Example: `feat/1-project-bootstrap`.

Create short-lived branches from `main` and merge them through a pull request using squash merge.

## Commits

Use Conventional Commits in English:

```text
feat: add product entity
fix: prevent negative inventory
test: cover order confirmation rule
docs: describe product scope
chore: configure editor settings
```

## Pull requests

- Keep the scope focused.
- Run the test suite locally.
- Update documentation when behavior or setup changes.
- Never commit secrets, private keys, or `.env` files.
