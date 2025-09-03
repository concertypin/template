import { defineConfig } from "vite";
import { VitePWA } from "vite-plugin-pwa";

// Since it distracts debugging via service worker, enable it only on production build
const prodOnlyPlugin = [
]
export default defineConfig({
    server: {
        open: "index.html",
    },
    build: {
        outDir: "dist",
        sourcemap: true,
    },
    clearScreen: false,
    plugins: [
        ...(prodOnlyPlugin.map(i => ({ ...i, apply: "build" })))
    ]
});
