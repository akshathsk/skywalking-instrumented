import type { ExtractPropTypes, StyleValue } from 'vue';
export declare const elTeleportProps: {
    container: import("element-plus/es/utils").BuildPropReturn<import("element-plus/es/utils").PropWrapper<string>, string | (() => string) | undefined, unknown, unknown, unknown>;
    disabled: import("element-plus/es/utils").BuildPropReturn<BooleanConstructor, boolean | (() => false) | (() => true) | undefined, unknown, unknown, unknown>;
    style: import("element-plus/es/utils").BuildPropReturn<import("element-plus/es/utils").PropWrapper<StyleValue>, string | import("vue").CSSProperties | (() => string) | (() => import("vue").CSSProperties) | (() => StyleValue[]) | undefined, unknown, unknown, unknown>;
    zIndex: import("element-plus/es/utils").BuildPropReturn<StringConstructor, string | (() => string) | undefined, unknown, unknown, unknown>;
};
export declare type ElTeleportProps = ExtractPropTypes<typeof elTeleportProps>;
